package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "Inbox")
public class InboxModel implements Serializable {
    private static final long serialVersionUID = 8601169130085912016L;

    @DatabaseField(columnName = "Body")
    private String body;

    @DatabaseField(columnName = "EndDate")
    private Long endDate;

    @DatabaseField(columnName = "IconPath")
    private String iconPath;

    @DatabaseField(columnName = "State")
    private Integer notificationState;

    @DatabaseField(columnName = "ServerID", id = true, unique = true)
    private String serverId;

    @DatabaseField(columnName = "StartDate")
    private Long startDate;

    @DatabaseField(columnName = "Subtitle")
    private String subtitle;

    @DatabaseField(columnName = "Title")
    private String title;

    @DatabaseField(columnName = "IsRead")
    private Boolean isRead = Boolean.FALSE;

    @DatabaseField(canBeNull = true, columnName = BindInfoDTO.BIND_TYPE_EMAIL)
    private String email = null;
}
