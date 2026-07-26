package ir.mservices.market.versionNote.ui.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionNoteLastVersionData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_last_version_note;
    public final String a;
    public final ArrayList b;

    public VersionNoteLastVersionData(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionNoteLastVersionData)) {
            return false;
        }
        VersionNoteLastVersionData versionNoteLastVersionData = (VersionNoteLastVersionData) obj;
        return this.a.equals(versionNoteLastVersionData.a) && this.b.equals(versionNoteLastVersionData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }
}
