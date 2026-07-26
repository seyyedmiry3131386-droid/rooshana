package com.microsoft.clarity.i;

import com.microsoft.clarity.g.C0077y;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.display.DisallowedScreenDisplayFrame;
import com.microsoft.clarity.models.display.IDisplayFrame;
import com.microsoft.clarity.models.ingest.WebViewAnalyticsEvent;
import com.microsoft.clarity.models.ingest.WebViewMutationEvent;
import com.microsoft.clarity.models.observers.ErrorDisplayFrame;
import com.microsoft.clarity.models.observers.FramePicture;
import com.microsoft.clarity.models.observers.NetworkDisconnectedEvent;
import com.microsoft.clarity.models.observers.ObservedEvent;
import com.microsoft.clarity.models.observers.ObservedWebViewEvent;
import com.microsoft.clarity.models.observers.SerializedWebViewEvent;
import com.microsoft.clarity.models.observers.UserInteraction;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.bp2;
import defpackage.tx8;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0086h extends Lambda implements bp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ C0077y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086h(q qVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, C0077y c0077y) {
        super(0);
        this.a = qVar;
        this.b = ref$ObjectRef;
        this.c = ref$ObjectRef2;
        this.d = c0077y;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Object obj = (ObservedEvent) this.a.i.take();
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Queue size: " + this.a.i.size() + '.');
        boolean z = obj instanceof FramePicture;
        tx8 tx8Var = tx8.a;
        if (z) {
            this.b.a = ErrorType.PictureProcessing;
            this.c.a = obj;
            q qVar = this.a;
            com.microsoft.clarity.q.x.a("Clarity_ProcessPicture", qVar.g, new C0085g(this.d, qVar, (FramePicture) obj));
        } else if (obj instanceof UserInteraction) {
            this.b.a = ErrorType.UserInteractionProcessing;
            q.a(this.a, ((UserInteraction) obj).getAnalyticsEvent());
        } else if (obj instanceof ObservedWebViewEvent) {
            q qVar2 = this.a;
            ObservedWebViewEvent observedWebViewEvent = (ObservedWebViewEvent) obj;
            qVar2.getClass();
            if ((observedWebViewEvent instanceof SerializedWebViewEvent) && ((SerializedWebViewEvent) observedWebViewEvent).isAnalyticsEvent()) {
                WebViewAnalyticsEvent webViewAnalyticsEvent = new WebViewAnalyticsEvent(observedWebViewEvent.getTimestamp(), observedWebViewEvent.getData(), observedWebViewEvent.getWebViewHashCode(), observedWebViewEvent.getScreenMetadata(), observedWebViewEvent.getType());
                ArrayList<r> arrayList = qVar2.k;
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                for (r rVar : arrayList) {
                    rVar.getClass();
                    rVar.a.b.a(webViewAnalyticsEvent);
                    arrayList2.add(tx8Var);
                }
            } else {
                WebViewMutationEvent webViewMutationEvent = new WebViewMutationEvent(observedWebViewEvent.getTimestamp(), observedWebViewEvent.getData(), observedWebViewEvent.getWebViewHashCode(), observedWebViewEvent.getScreenMetadata(), observedWebViewEvent.getType(), observedWebViewEvent.getPageUrl());
                ArrayList<r> arrayList3 = qVar2.k;
                ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
                for (r rVar2 : arrayList3) {
                    rVar2.getClass();
                    rVar2.a.b.a(webViewMutationEvent);
                    arrayList4.add(tx8Var);
                }
            }
        } else if (obj instanceof ErrorDisplayFrame) {
            ErrorDisplayFrame errorDisplayFrame = (ErrorDisplayFrame) obj;
            for (r rVar3 : this.a.k) {
                rVar3.getClass();
                rVar3.a.b.a(errorDisplayFrame);
            }
        } else if (obj instanceof DisallowedScreenDisplayFrame) {
            IDisplayFrame iDisplayFrame = (IDisplayFrame) obj;
            for (r rVar4 : this.a.k) {
                rVar4.getClass();
                rVar4.a.b.a(iDisplayFrame);
            }
        } else if (obj instanceof NetworkDisconnectedEvent) {
            Iterator it = this.a.k.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a.b.d();
            }
        }
        return tx8Var;
    }
}
