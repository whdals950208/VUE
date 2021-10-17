package music.musicspring.board;

import music.musicspring.domain.BoardVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardList();

    BoardVO getBoardDetail(BoardVO vo);
}
