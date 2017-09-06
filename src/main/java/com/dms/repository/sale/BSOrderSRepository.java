package com.dms.repository.sale;


        import com.dms.model.BSOrderSEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Modifying;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;
        import org.springframework.transaction.annotation.Transactional;

        import java.util.List;

@Repository
public interface BSOrderSRepository  extends JpaRepository<BSOrderSEntity, String> {
    @Transactional(timeout = 10)
    @Query("select bSOrderS from BSOrderSEntity bSOrderS where bSOrderS.bSOrderSSOrderNo = ?1")

    List<BSOrderSEntity> findBSOrderSEntitiesByBSOrderSSOrderNoEquals(String id);
    //-----------通过销售订货单号（BSOrderSSOrderNo）和明细ID（BSOrderSDetailId）查询 BSOrderSEntity里的一条内容--------------
    BSOrderSEntity findBSOrderSEntitiesByBSOrderSSOrderNoAndBSOrderSDetailIdEquals(String BSOrderSSOrderNo,Integer detailid);

    //-----------通过销售订货单号（BSOrderSSOrderNo）和明细ID（BSOrderSDetailId）删除 BSOrderSEntity里的一条内容--------------
    @Transactional
    @Modifying
    @Query("delete from BSOrderSEntity where bSOrderSSOrderNo in (:bSOrderSSOrderNo) and bSOrderSDetailId in (:bSOrderSDetailId)")
    public void deleteBSOrderSEntity(@Param("bSOrderSSOrderNo") String bSOrderSSOrderNo,@Param("bSOrderSDetailId") Integer bSOrderSDetailId );

    //======================================================================================================

    //-----------通过销售订货单号（bSOrderSSOrderNo）删除 BSOrderSEntity里的所有内容--------------
    @Transactional
    @Modifying
    @Query("delete from BSOrderSEntity where bSOrderSSOrderNo in (:bSOrderSSOrderNo)")
    public void deleteAllBSOrderSEntity(@Param("bSOrderSSOrderNo") String bSOrderSSOrderNo );

    //找到该所有明细的最大DetailID
    @Transactional
    @Query("select max(bSOrderS.bSOrderSDetailId) from BSOrderSEntity bSOrderS where bSOrderS.bSOrderSSOrderNo = ?1")
    Integer  findMaxDetailId(String bSOrderNo );


}
