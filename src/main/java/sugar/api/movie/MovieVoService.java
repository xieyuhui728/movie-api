package sugar.api.movie;


import sugar.vo.MovieVo;

/**
 * Created by xieyuhui on 2017/4/16.
 * 供第三方调用的接口
 */
public interface MovieVoService {

    String getName(String name);

    MovieVo getMovie(Long id);

    int delMovie(Long id);
}
