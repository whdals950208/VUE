package music.musicspring.test;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestDAO {
    List<Map<String,String>> getTest();
}
