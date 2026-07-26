package ir.mservices.market.version2.webapi.responsedto;

import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class HarmfulAppData {
    private final List<String> appList;
    private final String description;
    private final String title;

    public HarmfulAppData(List<String> list, String str, String str2) {
        js3.p(list, "appList");
        js3.p(str, "title");
        this.appList = list;
        this.title = str;
        this.description = str2;
    }

    public final List<String> getAppList() {
        return this.appList;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getHarmfulAppsSize() {
        return this.appList.size();
    }

    public final String getTitle() {
        return this.title;
    }

    public HarmfulAppData(HarmfulAppsDto harmfulAppsDto) {
        js3.p(harmfulAppsDto, "harmfulAppsDto");
        List<HarmfulAppDto> harmfulApps = harmfulAppsDto.getHarmfulApps();
        ArrayList arrayList = new ArrayList(wu0.V(harmfulApps, 10));
        Iterator<T> it = harmfulApps.iterator();
        while (it.hasNext()) {
            arrayList.add(((HarmfulAppDto) it.next()).getPackageName());
        }
        this(a.Q0(arrayList), harmfulAppsDto.getTitle(), harmfulAppsDto.getDescription());
    }

    public HarmfulAppData() {
        this(a.Q0(EmptyList.a), "", "");
    }
}
