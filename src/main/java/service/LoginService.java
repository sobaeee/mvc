package service;

import domain.LoginDTO;
import domain.LoginVO;

public interface LoginService {
	
	public abstract LoginVO read(LoginDTO dto);
}
