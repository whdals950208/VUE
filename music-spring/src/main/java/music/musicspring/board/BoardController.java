package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import music.musicspring.domain.ResultVO;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("api/board")
public class BoardController {
    @Autowired BoardService service;

    @GetMapping("/list")
    public List<BoardVO> getBoardList(){
        return service.getBoardList();
    }

    @GetMapping("/detail/{idx}")
    public List<BoardVO> getBoardDetail(@PathVariable int idx){
        BoardVO vo = new BoardVO();
        vo.setIdx(idx);
        return service.getBoardDetail(vo);
    }

    @PutMapping("/upsert")
    public ResultVO upsertBoard(@RequestBody BoardVO vo){
        return service.upsertBoard(vo);
    }
    @DeleteMapping("/delete")
    public ResultVO deleteBoard(@RequestBody BoardVO vo){
        return service.deleteBoard(vo);
    }
}

