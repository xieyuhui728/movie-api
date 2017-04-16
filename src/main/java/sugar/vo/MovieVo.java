package sugar.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xieyuhui on 2017/4/16.
 */
public class MovieVo implements Serializable{
    private Long id;
    private String movieName;
    private Date cteateTime;

    public MovieVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }

    @Override
    public String toString() {
        return "MovieVo{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", cteateTime=" + cteateTime +
                '}';
    }
}
