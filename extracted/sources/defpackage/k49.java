package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteHeaderData;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteLastVersionData;
import ir.mservices.market.versionNote.ui.recycler.VersionRowData;

/* JADX INFO: loaded from: classes3.dex */
public final class k49 extends a {
    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == VersionNoteLastVersionData.c) {
            return new l5(26, view);
        }
        if (i == VersionRowData.b) {
            return new l5(27, view);
        }
        if (i == VersionNoteHeaderData.b) {
            return new l5(25, view);
        }
        return null;
    }
}
