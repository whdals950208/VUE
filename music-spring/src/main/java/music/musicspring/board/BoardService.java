package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import music.musicspring.domain.ResultVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardList();

    List<BoardVO> getBoardDetail(BoardVO vo);

    ResultVO upsertBoard(BoardVO vo);

    ResultVO deleteBoard(BoardVO vo);
}
