package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.repository.ItemDao;

public class RegistController implements Controller{

//ItemDao½½·Ô
	private ItemDao itemDao;
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equals("GET")) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/WEB-INF/view/regist.jsp");
			return mv;
		}else if(req.getMethod().equals("POST")) {
			String type = req.getParameter("type");
			String name = req.getParameter("name");
			int price = Integer.parseInt(req.getParameter("price"));
			itemDao.insert(type,name, price);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("redirect:/");
			return mv;
		}
		return null;
	}

}
