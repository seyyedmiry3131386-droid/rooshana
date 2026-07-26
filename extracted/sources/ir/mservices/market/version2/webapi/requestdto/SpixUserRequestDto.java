package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SpixUserRequestDto implements RequestDTO, Serializable {
    private String accountId;

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    private String f0android;
    private String cpuAbis;
    private String device;
    private String manufacturer;
    private String uuid;

    public SpixUserRequestDto(String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.accountId = str;
        this.uuid = str2;
        this.device = str3;
        this.manufacturer = str5;
        this.f0android = str4;
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb.append((CharSequence) "|");
                }
            }
        }
        this.cpuAbis = sb.toString();
    }
}
