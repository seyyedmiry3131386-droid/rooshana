package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class xc6 {
    public final List a;
    public final String b;
    public final String c;
    public String d;
    public final wb5 e;
    public final wb5 f;
    public final wb5 g;
    public final wb5 h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final SnapshotStateList k;

    public xc6(String str, String str2, String str3, int i) {
        uo6.e.getClass();
        uo6 uo6Var = uo6.g;
        List list = wa6.b;
        EmptyList emptyList = EmptyList.a;
        List list2 = wa6.b;
        ArrayList arrayList = new ArrayList(wu0.V(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new wa6(((Number) it.next()).floatValue()));
        }
        str = (i & 256) != 0 ? "" : str;
        str2 = (i & 512) != 0 ? "" : str2;
        str3 = (i & 1024) != 0 ? "" : str3;
        js3.p(uo6Var, "selectedQuality");
        js3.p(emptyList, "qualityTracks");
        js3.p(emptyList, "subtitleTracks");
        js3.p(emptyList, "audioTracks");
        js3.p(str, "playId");
        js3.p(str2, "movieId");
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = g.h(uo6Var);
        this.f = g.h(null);
        this.g = g.h(null);
        this.h = g.h(new wa6(1.0f));
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(emptyList);
        this.i = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(emptyList);
        this.j = snapshotStateList2;
        SnapshotStateList snapshotStateList3 = new SnapshotStateList();
        snapshotStateList3.addAll(emptyList);
        this.k = snapshotStateList3;
    }

    public final String toString() {
        uo6 uo6Var = (uo6) ((s08) this.e).getValue();
        db8 db8Var = (db8) ((s08) this.f).getValue();
        s00 s00Var = (s00) ((s08) this.g).getValue();
        String strB = wa6.b(((wa6) ((s08) this.h).getValue()).a);
        String str = this.d;
        StringBuilder sb = new StringBuilder("PlayerConfig(selectedQuality=");
        sb.append(uo6Var);
        sb.append(", selectedSubtitle=");
        sb.append(db8Var);
        sb.append(", selectedAudio=");
        sb.append(s00Var);
        sb.append(", selectedSpeed=");
        sb.append(strB);
        sb.append(", qualityTracks=");
        sb.append(this.i);
        sb.append(", subtitleTracks=");
        sb.append(this.j);
        sb.append(", audioTracks=");
        sb.append(this.k);
        sb.append(", playbackSpeeds=");
        sb.append(this.a);
        sb.append(", playId='");
        o40.I(this.b, "', movieId='", this.c, "', mainUrl='", sb);
        return dw1.s(sb, str, "')");
    }
}
