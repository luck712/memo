package memo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import memo.entity.MemoDto;

public class MemoDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void write(String content) {
		String sql = "insert into memo values(memo_seq.nextval,?,sysdate)";
		Object[] param = {content};
		jdbcTemplate.update(sql,param);
	}
	
	public List<MemoDto> list() {
		String sql ="select * from memo";
		RowMapper<MemoDto> mapper = new RowMapper<MemoDto>() {
		
			@Override
			public MemoDto mapRow(ResultSet rs, int index) throws SQLException {
				MemoDto mdto = new MemoDto();
				mdto.setNo(rs.getInt("no"));
				mdto.setContent(rs.getString("content"));
				mdto.setWhen(rs.getString("when"));
				return mdto;
			}
		};
		List<MemoDto> list = jdbcTemplate.query(sql,mapper);
		return list;
	}

}
