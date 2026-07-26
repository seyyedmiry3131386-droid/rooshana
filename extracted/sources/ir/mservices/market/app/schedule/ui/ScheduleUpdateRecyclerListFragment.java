package ir.mservices.market.app.schedule.ui;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.af7;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.f60;
import defpackage.g27;
import defpackage.g8;
import defpackage.hh2;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.k50;
import defpackage.lu7;
import defpackage.mp6;
import defpackage.mr7;
import defpackage.o79;
import defpackage.og5;
import defpackage.ox5;
import defpackage.pq6;
import defpackage.pr7;
import defpackage.q79;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sk6;
import defpackage.t40;
import defpackage.vd7;
import defpackage.wz5;
import defpackage.x79;
import defpackage.yq2;
import defpackage.zc;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment;
import ir.mservices.market.app.schedule.ui.recycler.ManageUpdateScheduleData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeData;
import ir.mservices.market.app.schedule.ui.recycler.b;
import ir.mservices.market.app.schedule.ui.recycler.d;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduleUpdateRecyclerListFragment extends Hilt_ScheduleUpdateRecyclerListFragment {
    public static final /* synthetic */ int k1 = 0;
    public k50 i1;
    public final o79 j1;

    public ScheduleUpdateRecyclerListFragment() {
        final ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$1 scheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$1 = new ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) scheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(ScheduleUpdateViewModel.class), new bp2() { // from class: ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_TIME_START".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("update_schedulestart_time_set");
                    clickEventBuilder.a();
                    int i = bundle.getInt("schedulePickedTime");
                    k50 k50Var = this.i1;
                    if (k50Var == null) {
                        js3.V("barnamehAnalytics");
                        throw null;
                    }
                    k50Var.a.b("schedule_start", "time", String.valueOf(i));
                    ScheduleUpdateViewModel scheduleUpdateViewModelR1 = R1();
                    String strF = scheduleUpdateViewModelR1.t.a.f(lu7.A, "07:00");
                    js3.o(strF, "getScheduledDownloadStopTime(...)");
                    scheduleUpdateViewModelR1.r(i, s7.e0(strF)[0]);
                    scheduleUpdateViewModelR1.t();
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_TIME_STOP".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                    clickEventBuilder2.b("update_scheduleend_time_set");
                    clickEventBuilder2.a();
                    int i2 = bundle.getInt("schedulePickedTime");
                    k50 k50Var2 = this.i1;
                    if (k50Var2 == null) {
                        js3.V("barnamehAnalytics");
                        throw null;
                    }
                    k50Var2.a.b("schedule_end", "time", String.valueOf(i2));
                    ScheduleUpdateViewModel scheduleUpdateViewModelR12 = R1();
                    String strF2 = scheduleUpdateViewModelR12.t.a.f(lu7.z, "02:00");
                    js3.o(strF2, "getScheduledDownloadStartTime(...)");
                    scheduleUpdateViewModelR12.r(s7.e0(strF2)[0], i2);
                    scheduleUpdateViewModelR12.t();
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_TYPE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    boolean z = bundle.getBoolean("scheduleTypeIsGPRS");
                    if (z) {
                        dw1.y("update_scheduledownload_sim");
                    } else {
                        dw1.y("update_scheduledownload_wifi");
                    }
                    ScheduleUpdateViewModel scheduleUpdateViewModelR13 = R1();
                    pr7 pr7Var = scheduleUpdateViewModelR13.t;
                    ((mr7) pr7Var.b.get()).b("SCHEDULED_DOWNLOAD_SIM_DATA", String.valueOf(pr7Var.d()), String.valueOf(z));
                    pr7Var.a.j(lu7.B, z);
                    scheduleUpdateViewModelR13.g(new wz5(new vd7(11), new g8(22, scheduleUpdateViewModelR13)));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_NEED_ALARM".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:ir.mservices.market"));
                FragmentActivity fragmentActivityF = F();
                if (fragmentActivityF != null) {
                    if (intent.resolveActivity(fragmentActivityF.getPackageManager()) != null) {
                        fragmentActivityF.startActivityForResult(intent, 5002);
                    } else {
                        hh2.H(new hh2(fragmentActivityF, fragmentActivityF.getString(rs6.app_settings_failed_message)));
                    }
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_update_schedule);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.update_setting);
        js3.o(string, "getString(...)");
        return string;
    }

    public final String Q1() {
        return dw1.n("ScheduleUpdateRecyclerListFragment_", this.H0);
    }

    public final ScheduleUpdateViewModel R1() {
        return (ScheduleUpdateViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        ScheduleUpdateViewModel scheduleUpdateViewModelR1 = R1();
        af7 af7Var = scheduleUpdateViewModelR1.u;
        if (scheduleUpdateViewModelR1.t.a.b(lu7.x0, false)) {
            if (af7Var.a()) {
                af7Var.f();
            } else {
                af7Var.e();
            }
        }
        return t40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void g0() {
        super.g0();
        ScheduleUpdateViewModel scheduleUpdateViewModelR1 = R1();
        sk6 sk6Var = scheduleUpdateViewModelR1.v;
        if (dp3.c((Context) sk6Var.d)) {
            if (Build.VERSION.SDK_INT >= 31 ? zc.a((AlarmManager) sk6Var.c) : true) {
                return;
            }
        }
        l lVar = scheduleUpdateViewModelR1.x;
        Boolean bool = Boolean.FALSE;
        lVar.getClass();
        lVar.p(null, bool);
        scheduleUpdateViewModelR1.t.a.j(lu7.x0, false);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        ox5 ox5Var = new ox5(1, 2);
        final int i = 0;
        ox5Var.m = new og5(this) { // from class: xe7
            public final /* synthetic */ ScheduleUpdateRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) obj;
                        int i3 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.schedule.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(manageUpdateScheduleData, "recyclerData");
                        dw1.y(!((Boolean) manageUpdateScheduleData.a.getValue()).booleanValue() ? "update_schedule_activate" : "update_schedule_deactivate");
                        scheduleUpdateRecyclerListFragment.R1().s(!((Boolean) r8.getValue()).booleanValue());
                        break;
                    case 1:
                        int i4 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("update_schedulestart_time");
                        clickEventBuilder.a();
                        String strF = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.z, "02:00");
                        js3.o(strF, "getScheduledDownloadStartTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_START", null, 12), String.valueOf(s7.e0(strF)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.start_time))), -1);
                        break;
                    case 2:
                        int i5 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("update_scheduleend_time");
                        clickEventBuilder2.a();
                        String strF2 = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.A, "07:00");
                        js3.o(strF2, "getScheduledDownloadStopTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_STOP", null, 12), String.valueOf(s7.e0(strF2)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.end_time))), -1);
                        break;
                    default:
                        int i6 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((ScheduleTypeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("update_scheduledownload");
                        clickEventBuilder3.a();
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.ScheduleType(new ve7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TYPE", null, 12), scheduleUpdateRecyclerListFragment.R1().t.d())), -1);
                        break;
                }
            }
        };
        final int i2 = 1;
        ox5Var.n = new og5(this) { // from class: xe7
            public final /* synthetic */ ScheduleUpdateRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) obj;
                        int i3 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.schedule.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(manageUpdateScheduleData, "recyclerData");
                        dw1.y(!((Boolean) manageUpdateScheduleData.a.getValue()).booleanValue() ? "update_schedule_activate" : "update_schedule_deactivate");
                        scheduleUpdateRecyclerListFragment.R1().s(!((Boolean) r8.getValue()).booleanValue());
                        break;
                    case 1:
                        int i4 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("update_schedulestart_time");
                        clickEventBuilder.a();
                        String strF = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.z, "02:00");
                        js3.o(strF, "getScheduledDownloadStartTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_START", null, 12), String.valueOf(s7.e0(strF)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.start_time))), -1);
                        break;
                    case 2:
                        int i5 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("update_scheduleend_time");
                        clickEventBuilder2.a();
                        String strF2 = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.A, "07:00");
                        js3.o(strF2, "getScheduledDownloadStopTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_STOP", null, 12), String.valueOf(s7.e0(strF2)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.end_time))), -1);
                        break;
                    default:
                        int i6 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((ScheduleTypeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("update_scheduledownload");
                        clickEventBuilder3.a();
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.ScheduleType(new ve7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TYPE", null, 12), scheduleUpdateRecyclerListFragment.R1().t.d())), -1);
                        break;
                }
            }
        };
        final int i3 = 2;
        ox5Var.o = new og5(this) { // from class: xe7
            public final /* synthetic */ ScheduleUpdateRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) obj;
                        int i32 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.schedule.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(manageUpdateScheduleData, "recyclerData");
                        dw1.y(!((Boolean) manageUpdateScheduleData.a.getValue()).booleanValue() ? "update_schedule_activate" : "update_schedule_deactivate");
                        scheduleUpdateRecyclerListFragment.R1().s(!((Boolean) r8.getValue()).booleanValue());
                        break;
                    case 1:
                        int i4 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("update_schedulestart_time");
                        clickEventBuilder.a();
                        String strF = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.z, "02:00");
                        js3.o(strF, "getScheduledDownloadStartTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_START", null, 12), String.valueOf(s7.e0(strF)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.start_time))), -1);
                        break;
                    case 2:
                        int i5 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("update_scheduleend_time");
                        clickEventBuilder2.a();
                        String strF2 = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.A, "07:00");
                        js3.o(strF2, "getScheduledDownloadStopTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_STOP", null, 12), String.valueOf(s7.e0(strF2)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.end_time))), -1);
                        break;
                    default:
                        int i6 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((ScheduleTypeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("update_scheduledownload");
                        clickEventBuilder3.a();
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.ScheduleType(new ve7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TYPE", null, 12), scheduleUpdateRecyclerListFragment.R1().t.d())), -1);
                        break;
                }
            }
        };
        final int i4 = 3;
        ox5Var.p = new og5(this) { // from class: xe7
            public final /* synthetic */ ScheduleUpdateRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        ManageUpdateScheduleData manageUpdateScheduleData = (ManageUpdateScheduleData) obj;
                        int i32 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.schedule.ui.recycler.a) qg5Var, "<unused var>");
                        js3.p(manageUpdateScheduleData, "recyclerData");
                        dw1.y(!((Boolean) manageUpdateScheduleData.a.getValue()).booleanValue() ? "update_schedule_activate" : "update_schedule_deactivate");
                        scheduleUpdateRecyclerListFragment.R1().s(!((Boolean) r8.getValue()).booleanValue());
                        break;
                    case 1:
                        int i42 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("update_schedulestart_time");
                        clickEventBuilder.a();
                        String strF = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.z, "02:00");
                        js3.o(strF, "getScheduledDownloadStartTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_START", null, 12), String.valueOf(s7.e0(strF)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.start_time))), -1);
                        break;
                    case 2:
                        int i5 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((ScheduleTimeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("update_scheduleend_time");
                        clickEventBuilder2.a();
                        String strF2 = scheduleUpdateRecyclerListFragment.R1().t.a.f(lu7.A, "07:00");
                        js3.o(strF2, "getScheduledDownloadStopTime(...)");
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.Schedule(new pe7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TIME_STOP", null, 12), String.valueOf(s7.e0(strF2)[0]), scheduleUpdateRecyclerListFragment.K().getString(rs6.end_time))), -1);
                        break;
                    default:
                        int i6 = ScheduleUpdateRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((ScheduleTypeData) obj, "<unused var>");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("update_scheduledownload");
                        clickEventBuilder3.a();
                        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.ScheduleType(new ve7(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_TYPE", null, 12), scheduleUpdateRecyclerListFragment.R1().t.d())), -1);
                        break;
                }
            }
        };
        return ox5Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ScheduleUpdateViewModel scheduleUpdateViewModelR1 = R1();
        String[] stringArray = K().getStringArray(mp6.schedule_times);
        js3.o(stringArray, "getStringArray(...)");
        scheduleUpdateViewModelR1.w = stringArray;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ScheduleUpdateRecyclerListFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    public final void onEvent(f60 f60Var) {
        js3.p(f60Var, "event");
        if (f60Var.a == 5002) {
            R1().s(true);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, 0, K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
