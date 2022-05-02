package service;

import domain.LoginVO;
import domain.MypageDTO;

public interface MypageService {

	public abstract LoginVO read(MypageDTO dto);
}
