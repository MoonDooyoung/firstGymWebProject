package kr.co.firstgym.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// import kr.co.firstgym.command.UserVO;

public class UserAuthHandler extends HandlerInterceptorAdapter {

	/*
	//ȸ�������� �ʿ��� ������ ��û�� ������ �� ��û�� ����ä Ȯ���� ���ͼ���.

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//���ǿ��� �α��� �����͸� ���� �� Ȯ���� �� �ݽô�.
		HttpSession session = request.getSession();
		UserVO vo = (UserVO) session.getAttribute("login");

		if(vo == null) { //�α����� �ȵ� ����. (�α��� �������� �����ݽô�.)
			response.sendRedirect(request.getContextPath() + "/user/userLogin");

			return false; //��Ʈ�ѷ��� ������ �����ϴ�.
		} else {
			return true; //���~
		}

	}
	*/

}







