package music.musicspring.board;

import music.musicspring.domain.BoardVO;
import music.musicspring.domain.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired BoardDAO boardDAO;
    @Override
    public List<BoardVO> getBoardList() {
        return boardDAO.getBoardList();
    }

    @Override
    public List<BoardVO> getBoardDetail(BoardVO vo) {
        return boardDAO.getBoardDetail(vo);
    }

    @Override
    public ResultVO upsertBoard(BoardVO vo) {
        ResultVO result = new ResultVO();
        int dbResult = boardDAO.upsertBoard(vo);;
        if(dbResult==1) {
            result.setValid(true);
            result.setMessage("게시글 수정이 완료 되었습니다.");
        }else{
            result.setValid(false);
            result.setMessage("게시글 수정 중 오류가 발생 했습니다.");
        }
        return result;
    }

    @Override
    public ResultVO deleteBoard(BoardVO vo) {
        ResultVO result = new ResultVO();
        int dbResult = boardDAO.deleteBoard(vo);;
        if(dbResult==1) {
            result.setValid(true);
            result.setMessage("게시글 삭제가 완료 되었습니다.");
        }else{
            result.setValid(false);
            result.setMessage("게시글 삭제 중 오류가 발생 했습니다.");
        }
        return result;
    }
}
