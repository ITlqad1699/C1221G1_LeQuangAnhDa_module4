package com.codegym.casestudy.model.contract;

import javax.persistence.*;

@Entity
@Table(name="contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_id")
    private Integer id;
    private String Quantity;

    @ManyToOne
    @JoinColumn(name = "attact_service_id", referencedColumnName = "attact_service_id")
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public ContractDetail(Integer id, String quantity, AttachService attachService) {
        this.id = id;
        Quantity = quantity;
        this.attachService = attachService;
    }

    public ContractDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }


}
