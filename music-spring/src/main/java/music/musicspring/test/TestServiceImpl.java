package music.musicspring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService{
    @Autowired TestDAO testDAO;

    @Override
    public List<Map<String,String>> test() {
        return testDAO.getTest();
    }
}
