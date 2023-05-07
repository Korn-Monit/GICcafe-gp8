package gp8.itc.cafe.Controller.DataStructure;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table(name = "history")
public class History{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int history_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private CafeTable tableId;


    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public int getHistory_id() {
        return history_id;
    }

    public void setHistory_id(int history_id) {
        this.history_id = history_id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public CafeTable getTableId() {
        return tableId;
    }

    public void setTableId(CafeTable tableId) {
        this.tableId = tableId;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }


    
}
