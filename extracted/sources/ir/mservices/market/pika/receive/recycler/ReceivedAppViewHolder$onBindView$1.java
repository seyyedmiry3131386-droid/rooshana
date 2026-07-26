package ir.mservices.market.pika.receive.recycler;

import android.content.res.Resources;
import android.view.View;
import defpackage.d04;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.m86;
import defpackage.n86;
import defpackage.og5;
import defpackage.p86;
import defpackage.q86;
import defpackage.qg5;
import defpackage.qp2;
import defpackage.r86;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.s86;
import defpackage.t86;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.pika.PikaEventBuilder;
import ir.mservices.market.pika.receive.ReceiveState;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PikaReceiveView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.recycler.ReceivedAppViewHolder$onBindView$1", f = "ReceivedApp.kt", l = {111}, m = "invokeSuspend", v = 1)
final class ReceivedAppViewHolder$onBindView$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReceivedAppData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.pika.receive.recycler.ReceivedAppViewHolder$onBindView$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.receive.recycler.ReceivedAppViewHolder$onBindView$1$1", f = "ReceivedApp.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ ReceivedAppData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, ReceivedAppData receivedAppData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = receivedAppData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((t86) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            a aVar = this.b;
            og5 og5Var = aVar.w;
            View view = aVar.a;
            t86 t86Var = (t86) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = t86Var instanceof n86;
            ReceivedAppData receivedAppData = this.c;
            if (z || (t86Var instanceof s86)) {
                PikaEventBuilder pikaEventBuilder = new PikaEventBuilder();
                pikaEventBuilder.c.putString("on", "receive_success");
                pikaEventBuilder.a();
                String string2 = view.getResources().getString(rs6.received_and_ready_to_install);
                js3.o(string2, "getString(...)");
                int i = a.E;
                aVar.z(string2, false, true);
                PikaReceiveView pikaReceiveView = aVar.x().z;
                js3.o(pikaReceiveView, "install");
                qg5.v(pikaReceiveView, og5Var, aVar, receivedAppData);
            } else if (t86Var instanceof q86) {
                if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - aVar.A) > 0.3d || ((q86) t86Var).a == 100) {
                    d04 d04Var = aVar.D;
                    if (d04Var == null) {
                        js3.V("languageHelper");
                        throw null;
                    }
                    if (d04Var.f()) {
                        Resources resources = view.getResources();
                        int i2 = rs6.active_download_pending;
                        aVar.y();
                        q86 q86Var = (q86) t86Var;
                        String strH = lw8.h(q86Var.b);
                        aVar.y();
                        string = resources.getString(i2, strH, lw8.h(q86Var.c));
                    } else {
                        Resources resources2 = view.getResources();
                        int i3 = rs6.active_download_pending;
                        aVar.y();
                        q86 q86Var2 = (q86) t86Var;
                        String strH2 = lw8.h(q86Var2.c);
                        aVar.y();
                        string = resources2.getString(i3, strH2, lw8.h(q86Var2.b));
                    }
                    js3.m(string);
                    aVar.z(lw8.e(aVar.y(), string), false, false);
                    aVar.A = System.currentTimeMillis();
                }
                PikaReceiveView pikaReceiveView2 = aVar.x().z;
                js3.o(pikaReceiveView2, "install");
                qg5.v(pikaReceiveView2, aVar.x, aVar, receivedAppData);
            } else if (t86Var instanceof p86) {
                String string3 = view.getResources().getString(rs6.process_started);
                js3.o(string3, "getString(...)");
                int i4 = a.E;
                aVar.z(string3, false, false);
            } else if (t86Var instanceof r86) {
                MyketTextView myketTextView = aVar.x().y;
                js3.o(myketTextView, "info");
                myketTextView.setVisibility(8);
                PikaReceiveView pikaReceiveView3 = aVar.x().z;
                js3.o(pikaReceiveView3, "install");
                qg5.v(pikaReceiveView3, aVar.y, aVar, receivedAppData);
            } else if (t86Var instanceof m86) {
                PikaEventBuilder pikaEventBuilder2 = new PikaEventBuilder();
                pikaEventBuilder2.c.putString("on", "receive_failure");
                pikaEventBuilder2.a();
                PikaReceiveView pikaReceiveView4 = aVar.x().z;
                js3.o(pikaReceiveView4, "install");
                ReceiveState receiveState = ((m86) t86Var).a;
                pikaReceiveView4.setVisibility(receiveState == ReceiveState.c ? 0 : 8);
                int iOrdinal = receiveState.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    String string4 = view.getResources().getString(rs6.send_app_paused);
                    js3.o(string4, "getString(...)");
                    aVar.z(string4, true, false);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string5 = view.getResources().getString(rs6.ready_for_install);
                    js3.o(string5, "getString(...)");
                    aVar.z(string5, false, true);
                    js3.o(view, "itemView");
                    qg5.v(view, og5Var, aVar, receivedAppData);
                }
            } else {
                js3.o(view, "itemView");
                qg5.v(view, null, aVar, receivedAppData);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedAppViewHolder$onBindView$1(g51 g51Var, ReceivedAppData receivedAppData, a aVar) {
        super(2, g51Var);
        this.b = receivedAppData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReceivedAppViewHolder$onBindView$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceivedAppViewHolder$onBindView$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            ReceivedAppData receivedAppData = this.b;
            rv6 rv6Var = receivedAppData.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, receivedAppData, this.c);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
