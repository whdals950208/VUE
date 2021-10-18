package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import music.musicspring.domain.ResultVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    List<BoardVO> getBoardList();

    List<BoardVO> getBoardDetail(BoardVO vo);

    Integer upsertBoard(BoardVO vo);

    Integer deleteBoard(BoardVO vo);
}
