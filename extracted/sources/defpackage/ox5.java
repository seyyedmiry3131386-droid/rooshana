package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.app.schedule.ui.recycler.ManageUpdateScheduleData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTipData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeData;
import ir.mservices.market.app.schedule.ui.recycler.c;
import ir.mservices.market.app.schedule.ui.recycler.d;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppBarData;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppInfoData;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppSuggestData;
import ir.mservices.market.app.suggest.detail.recycler.PlayDescriptionData;
import ir.mservices.market.app.suggest.detail.recycler.PlayScreenshots;
import ir.mservices.market.app.suggest.detail.recycler.b;
import ir.mservices.market.app.suggest.search.ui.recycler.SuggestData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileActionData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ox5 extends a {
    public final /* synthetic */ int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox5(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        qg5 zx5Var;
        qg5 dVar;
        qg5 aVar;
        switch (this.l) {
            case 0:
                if (i == OwnProfileActionData.c) {
                    vx5 vx5Var = (vx5) this.n;
                    if (vx5Var == null) {
                        js3.V("messagesClickListener");
                        throw null;
                    }
                    vx5 vx5Var2 = (vx5) this.m;
                    if (vx5Var2 == null) {
                        js3.V("editProfileClickListener");
                        throw null;
                    }
                    zx5Var = new ir.mservices.market.social.profile.own.recycler.a(view, vx5Var, vx5Var2);
                } else {
                    if (i == ProfileInfoData.c) {
                        return new l5(view);
                    }
                    if (i == FollowRequestData.b) {
                        vx5 vx5Var3 = (vx5) this.o;
                        if (vx5Var3 == null) {
                            js3.V("onFollowRequestClickListener");
                            throw null;
                        }
                        zx5Var = new eh2(view, vx5Var3);
                    } else {
                        if (i != OwnProfileTipData.b) {
                            if (i == DividerData.k) {
                                return new oq1(view);
                            }
                            return null;
                        }
                        vx5 vx5Var4 = (vx5) this.p;
                        if (vx5Var4 == null) {
                            js3.V("onTipClickListener");
                            throw null;
                        }
                        zx5Var = new zx5(view, vx5Var4);
                    }
                }
                return zx5Var;
            case 1:
                if (i == PlayAppBarData.c) {
                    return new l5(17, view);
                }
                if (i == PlayAppSuggestData.h) {
                    ir.mservices.market.app.suggest.detail.ui.a aVar2 = (ir.mservices.market.app.suggest.detail.ui.a) this.m;
                    if (aVar2 != null) {
                        return new ir.mservices.market.app.suggest.detail.recycler.a(view, aVar2);
                    }
                    js3.V("onSuggestClickListener");
                    throw null;
                }
                if (i == PlayAppInfoData.g) {
                    ia6 ia6Var = (ia6) this.n;
                    if (ia6Var != null) {
                        return new ga6(view, ia6Var);
                    }
                    js3.V("onCategoryClickListener");
                    throw null;
                }
                if (i == PlayDescriptionData.c) {
                    return new l5(18, view);
                }
                if (i == AppDeveloperInfoModuleData.b) {
                    ia6 ia6Var2 = (ia6) this.o;
                    if (ia6Var2 != null) {
                        return new aq(view, ia6Var2);
                    }
                    js3.V("onDeveloperTitleClickListener");
                    throw null;
                }
                if (i != PlayScreenshots.c) {
                    return null;
                }
                ia6 ia6Var3 = (ia6) this.p;
                if (ia6Var3 != null) {
                    return new b(this.h, view, ia6Var3);
                }
                js3.V("onScreenshotClickListener");
                throw null;
            case 2:
                if (i == ManageUpdateScheduleData.c) {
                    xe7 xe7Var = (xe7) this.m;
                    if (xe7Var == null) {
                        js3.V("onEnableScheduleUpdateClickListener");
                        throw null;
                    }
                    dVar = new ir.mservices.market.app.schedule.ui.recycler.a(view, xe7Var);
                } else if (i == ScheduleTimeData.e) {
                    xe7 xe7Var2 = (xe7) this.n;
                    if (xe7Var2 == null) {
                        js3.V("onStartTimeClickListener");
                        throw null;
                    }
                    xe7 xe7Var3 = (xe7) this.o;
                    if (xe7Var3 == null) {
                        js3.V("onEndTimeClickListener");
                        throw null;
                    }
                    dVar = new ir.mservices.market.app.schedule.ui.recycler.b(view, xe7Var2, xe7Var3);
                } else {
                    if (i != ScheduleTypeData.e) {
                        if (i == ScheduleTipData.c) {
                            return new c(view);
                        }
                        if (i == DividerData.k) {
                            return new oq1(view);
                        }
                        return null;
                    }
                    xe7 xe7Var4 = (xe7) this.p;
                    if (xe7Var4 == null) {
                        js3.V("onScheduleTypeClickListener");
                        throw null;
                    }
                    dVar = new d(view, xe7Var4);
                }
                return dVar;
            case 3:
                if (i == AppScreenshotData.j) {
                    final int i2 = 0;
                    return new bs(view, new og5(this) { // from class: sf7
                        public final /* synthetic */ ox5 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.og5
                        public final void m(View view2, qg5 qg5Var, Object obj) {
                            switch (i2) {
                                case 0:
                                    js3.p(view2, "<unused var>");
                                    js3.p((bs) qg5Var, "<unused var>");
                                    js3.p((AppScreenshotData) obj, "<unused var>");
                                    ((v50) this.b.o).invoke();
                                    break;
                                default:
                                    js3.p(view2, "<unused var>");
                                    js3.p((h) qg5Var, "<unused var>");
                                    js3.p((AppVideoShotData) obj, "<unused var>");
                                    ((v50) this.b.p).invoke();
                                    break;
                            }
                        }
                    });
                }
                if (i != AppVideoShotData.j) {
                    return null;
                }
                final int i3 = 1;
                return new h(view, new og5(this) { // from class: sf7
                    public final /* synthetic */ ox5 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.og5
                    public final void m(View view2, qg5 qg5Var, Object obj) {
                        switch (i3) {
                            case 0:
                                js3.p(view2, "<unused var>");
                                js3.p((bs) qg5Var, "<unused var>");
                                js3.p((AppScreenshotData) obj, "<unused var>");
                                ((v50) this.b.o).invoke();
                                break;
                            default:
                                js3.p(view2, "<unused var>");
                                js3.p((h) qg5Var, "<unused var>");
                                js3.p((AppVideoShotData) obj, "<unused var>");
                                ((v50) this.b.p).invoke();
                                break;
                        }
                    }
                }, (f70) this.n, (String) this.m);
            default:
                if (i == SuggestData.f) {
                    jb8 jb8Var = (jb8) this.m;
                    if (jb8Var == null) {
                        js3.V("onSuggestClickListener");
                        throw null;
                    }
                    jb8 jb8Var2 = (jb8) this.n;
                    if (jb8Var2 == null) {
                        js3.V("onViewButtonClickListener");
                        throw null;
                    }
                    aVar = new rb8(view, jb8Var, jb8Var2);
                } else {
                    if (i != AppData.d) {
                        if (i == DividerData.k) {
                            return new oq1(view);
                        }
                        return null;
                    }
                    jb8 jb8Var3 = (jb8) this.p;
                    if (jb8Var3 == null) {
                        js3.V("onClickListener");
                        throw null;
                    }
                    t15 t15Var = (t15) this.o;
                    if (t15Var == null) {
                        js3.V("onFastDownloadClickListener");
                        throw null;
                    }
                    aVar = new ir.mservices.market.app.common.recycler.a(view, jb8Var3, t15Var, null);
                }
                return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox5(int i, String str, f70 f70Var, v50 v50Var, v50 v50Var2) {
        super(i);
        this.l = 3;
        js3.p(str, "videoId");
        this.m = str;
        this.n = f70Var;
        this.o = v50Var;
        this.p = v50Var2;
    }
}
