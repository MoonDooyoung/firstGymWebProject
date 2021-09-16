package kr.co.firstgym.util.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// import kr.co.firstgym.command.UserVO;

public class BoardAuthHandler extends HandlerInterceptorAdapter {

	/*
	//ȭ�鿡�� ����, ����, ������ �Ͼ ��, writer���� �Ѱ��ֵ��� ó��
	//�Խñ� ����, ������ ���� ���� ó�� �ڵ鷯
	//���ǰ��� writer(�ۼ���) ������ ���ٸ� ��Ʈ�ѷ��� ����,
	//�׷��� �ʴٸ� '������ �����ϴ�.' ��� �� �ڷΰ���.
	//������ �����ϴ� ���â�� jsp���� �߾��� PrintWriter ��ü�� �̿��Ͻø� �˴ϴ�.
	//PrintWriter ��ü�� response ��ü���� �޾� �ɴϴ�.

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("�Խ��� ���� ���ͼ��� �ߵ�!");

		String writer = request.getParameter("writer");
		HttpSession session = request.getSession();
		UserVO vo = (UserVO) session.getAttribute("login");

		System.out.println("ȭ�鿡�� �Ѿ���� ��: " + writer);
		System.out.println("���ǿ� ����� ��: " + vo);

		if(vo != null) {
			if(writer.equals(vo.getUserId())) {
				return true; //��Ʈ�ѷ��� ��û�� ������ ���.
			}
		} 

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<script> \r\n");
		out.print("alert('������ �����ϴ�.'); \r\n");
		out.print("history.back()");
		out.print("</script>");

		out.flush();

		return false;
	}
	*/

}
















