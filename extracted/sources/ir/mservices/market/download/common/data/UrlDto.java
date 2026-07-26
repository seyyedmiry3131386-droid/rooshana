package ir.mservices.market.download.common.data;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface UrlDto extends Serializable {
    String getContentLength();

    String getMd5CheckSum();

    String getType();

    String getUriPath();

    List<String> getUriServers();

    boolean isDiff();
}
