package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    List<BoardVO> getBoardList();

    BoardVO getBoardDetail(BoardVO vo);
}
