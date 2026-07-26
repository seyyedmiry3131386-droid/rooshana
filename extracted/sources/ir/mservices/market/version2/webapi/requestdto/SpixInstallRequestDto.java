package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SpixInstallRequestDto implements RequestDTO, Serializable {
    private String externalStorageSize;
    private String internalStorageSize;
    private boolean isPreapproval;
    private boolean isSplit;
    private boolean isUpdate;
    private String message;
    private String miui;
    private String otherPackageName;
    private String packageName;
    private String status;
    private String storagePath;
    private Integer versionCode;

    public SpixInstallRequestDto(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3) {
        this.packageName = str;
        this.versionCode = num;
        this.status = str2;
        this.message = str3;
        this.otherPackageName = str4;
        this.storagePath = str5;
        this.internalStorageSize = str6;
        this.externalStorageSize = str7;
        this.miui = str8;
        this.isUpdate = z;
        this.isSplit = z2;
        this.isPreapproval = z3;
    }
}
