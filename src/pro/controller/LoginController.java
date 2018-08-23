package pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import pro.dao.MemberDao;
import pro.vo.MemberVo;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	MemberDao memberDao;

	@GetMapping({"/loginForm"})
	public String LoginFormGetHandle() {
		return "login/loginForm";
	}
	
	@PostMapping("/loginForm")
	public ModelAndView LoginFormPostHandle(@RequestParam("id") String id, @RequestParam("password") String password, WebRequest req) { //id랑 password를 입력해서 넘겨줌
		
		ModelAndView mav = new ModelAndView();
		
		//로그인 처리 : 아이디가 있는지 보고, 비밀번호가 맞는지 보고
		//db : sql문 : select * from member where id=#{id} -> 반환타입: vo
		MemberVo vo = memberDao.findById(id);
		System.out.println("[controller:login] vo : " + vo.toString());
		//.equals(password) 맞으면(if-else) 어디로 보내야겠죠(index) 틀리면 다시하라고 보내야함 
		
		if(vo.getPassword().equals(password)) { //session에다가 vo를 올려주세요.
			mav.setViewName("index");
			req.setAttribute("vo", vo, WebRequest.SCOPE_SESSION);
		} else {
			mav.setViewName("login/loginForm");
		}
		return mav;
	}
	
	@GetMapping("/regForm")
	public String RegFormGetHandle() {
		return "login/regForm";
	}
	
	@PostMapping("/regForm")
	public ModelAndView RegFormPostHandle(@ModelAttribute MemberVo member) {
		ModelAndView mav = new ModelAndView();
		
		//member를 db에 넣어줘야겠죠: insert 작업
		
		mav.setViewName("login/reg");//회원가입되셨습니다.
		//login/reg.jsp를 만들어서 "${ nickname } 님 회원가입되셨습니다. 감사합니다." 이렇게 나타나도록. 
		//addObject(변수명, object); -> member를 member 에다가 넣어서
		
		return mav;
	}
}