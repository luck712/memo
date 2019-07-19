package memo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import memo.entity.MemoDto;
import memo.repository.MemoDao;

public class WriteController implements Controller {
	
	//MemoDao ����
	private MemoDao memoDao;
	public void setMemoDao(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if (req.getMethod().equals("GET")) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/WEB-INF/view/write.jsp");
			return mv;
		} else if (req.getMethod().equals("POST")) {

			String content = req.getParameter("content");
			memoDao.write(content);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("redirect:/");
			return mv;
		}
		
		return null;
	}

}
