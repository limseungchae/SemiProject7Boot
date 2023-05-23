package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    Map<String, Object> selectBoard(int cpage);
    Map<String, Object>  selectBoard(Map<String, Object> params);

    int insertBoard(Board bd);

    Board selectOneBoard(int bno);
}
