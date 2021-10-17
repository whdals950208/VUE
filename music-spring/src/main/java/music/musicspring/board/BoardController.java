package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("api/board")
public class BoardController {
    @Autowired BoardService service;
    @GetMapping("/list")
    public List<BoardVO> getBoardList(){
        return service.getBoardList();
    }
    @GetMapping("/detail")
    public BoardVO getBoardDetail(){
        System.out.println("111111");
        BoardVO vo = new BoardVO();
        return service.getBoardDetail(vo);
    }


}

