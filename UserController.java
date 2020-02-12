@Controller
public class UserController{

	//�α��� �������� �̵�
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("���:login");
		return "user/login";
	}

	//ȸ������ �������� �̵�
	@RequestMappin("/user/insert.do)
	public String insert(){
		logger.info("��� : insert");

		return "user/insert";
	}

	//ȸ������ �������� �̵�
	@RequestMappin("/user/update.do)
	public String update(){
		logger.info("��� : update");

		return "user/update";
	}

}

	



