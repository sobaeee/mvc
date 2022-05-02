package service;

import domain.LoginVO;
import domain.MypageDTO;
import mapper.MypageMapper;

public class MypageServiceImpl implements MypageService {
	
	@Override
	public LoginVO read(MypageDTO dto) {
		return new MypageMapper().read(dto);
	}
	

}
