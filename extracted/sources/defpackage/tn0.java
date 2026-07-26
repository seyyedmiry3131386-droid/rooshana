package defpackage;

import ir.mservices.market.common.data.ForceUpdateDto;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class tn0 {
    public int a;
    public long b;
    public Object c;

    public tn0(String str, int i, ForceUpdateDto forceUpdateDto) {
        this.c = str;
        this.a = i;
        this.b = forceUpdateDto != null ? forceUpdateDto.getFileLength() : -1L;
    }

    public tn0(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
