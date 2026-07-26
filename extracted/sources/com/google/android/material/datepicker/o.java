package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.zj4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ q b;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = qVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        n nVarA = materialCalendarGridView.a();
        if (i < nVarA.a() || i > nVarA.c()) {
            return;
        }
        i iVar = this.b.g;
        long jLongValue = materialCalendarGridView.a().getItem(i).longValue();
        MaterialCalendar materialCalendar = iVar.a;
        if (materialCalendar.D0.c.H0(jLongValue)) {
            materialCalendar.C0.e1(jLongValue);
            Iterator it = materialCalendar.A0.iterator();
            while (it.hasNext()) {
                ((zj4) it.next()).b(materialCalendar.C0.U0());
            }
            materialCalendar.J0.getAdapter().f();
            RecyclerView recyclerView = materialCalendar.I0;
            if (recyclerView != null) {
                recyclerView.getAdapter().f();
            }
        }
    }
}
