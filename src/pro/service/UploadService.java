package pro.service;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import pro.vo.MenuVo;
import pro.vo.MenuAttachVo;

@Service
public class UploadService {
	@Autowired
	ServletContext ctx;

	public MenuAttachVo execute(MultipartFile file, int storeNo) throws Exception {
		
		File dir = new File(ctx.getRealPath("/image"),String.valueOf(storeNo));
		
		System.out.println(ctx.getRealPath("/image"));
		
		if (!dir.exists())
			dir.mkdirs();

		File dest = new File(dir, file.getOriginalFilename());

		file.transferTo(dest);

		MenuAttachVo vo = new MenuAttachVo();
		vo.setName(file.getOriginalFilename());
		vo.setUri("/image/"+storeNo+"/"+file.getOriginalFilename());
		
		
		return vo;
	}
}