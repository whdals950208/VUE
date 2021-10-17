package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired BoardDAO boardDAO;
    @Override
    public List<BoardVO> getBoardList() {
        return boardDAO.getBoardList();
    }

    @Override
    public BoardVO getBoardDetail(BoardVO vo) {
        return boardDAO.getBoardDetail(vo);
    }
}
