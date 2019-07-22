package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import spring.repository.ItemDao;

public class ListController implements Controller{
	//ItemDao½½·Ô
		private ItemDao itemDao;
		public void setItemDao(ItemDao itemDao) {
			this.itemDao = itemDao;
		}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/list.jsp");
		mv.addObject("list", itemDao.list());
		return mv;
	}

}
