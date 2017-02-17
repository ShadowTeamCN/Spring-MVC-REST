package cn.ldx.repository;

/**
 * Created by Doenix Liu on 2017/2/17.
 */
import cn.ldx.model.AboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 @Repository
    public interface AboutRepository extends JpaRepository<AboutEntity , Integer> {

    }
