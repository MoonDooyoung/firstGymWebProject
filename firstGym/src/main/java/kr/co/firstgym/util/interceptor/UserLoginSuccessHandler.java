package kr.co.firstgym.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//import kr.co.firstgym.command.UserVO;

public class UserLoginSuccessHandler extends HandlerInterceptorAdapter {

	/*
	//�α��� ó�� ���Ŀ� ����Ǵ� �ڵ鷯 (PostHandle) �������̵�
	//1. login ��û���� ���� �� ����ǵ��� ��� (xml ���Ͽ� ������ ��� �� ����)

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("�α��� ���ͼ��� ����!");

		//modelAndView ��ü�� �ִ� �� �����Ͱ� map�� �������� ��ȯ.
		ModelMap mv = modelAndView.getModelMap();
		UserVO vo = (UserVO) mv.get("user");
		System.out.println("interceptor vo: " + vo);

		if(vo != null) { //��Ʈ�ѷ����� �α����� �����ߴ� ���.
			System.out.println("�α��� ���� ���� ����!");
			//�α��� ������ ȸ������ ���� �����͸� �����ؼ� �α��� ������ �ϰ� �� ��.
			HttpSession session = request.getSession();
			session.setAttribute("login", vo);
			response.sendRedirect(request.getContextPath());

		} else {
			System.out.println("�α��� ���� ���� ����!");
			modelAndView.addObject("msg", "loginFail");
			modelAndView.setViewName("/user/userLogin");
			//				response.sendRedirect(location);
		}

	}
	*/

}














