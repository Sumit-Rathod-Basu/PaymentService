package mapstruct.mapstructdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapstruct.mapstructdemo.Model.Ordermodel;

public interface orderRepo  extends JpaRepository<Ordermodel, Long>
 {
   
}
