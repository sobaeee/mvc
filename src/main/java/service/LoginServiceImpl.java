package service;

import domain.LoginDTO;
import domain.LoginVO;
import mapper.LoginMapper;

public class LoginServiceImpl implements LoginService{

	public LoginVO read(LoginDTO dto) {
		
		return new LoginMapper().read(dto);
	}

}
