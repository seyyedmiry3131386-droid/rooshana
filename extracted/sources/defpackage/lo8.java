package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;

/* JADX INFO: loaded from: classes.dex */
public final class lo8 extends TopicsManagerImplCommon {
    public final /* synthetic */ int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public lo8(int i) {
        this.d = i;
        switch (i) {
            case 1:
                js3.p(null, "context");
                TopicsManager topicsManager = TopicsManager.get(null);
                js3.o(topicsManager, "get(context)");
                super(topicsManager);
                break;
            default:
                js3.p(null, "context");
                TopicsManager topicsManager2 = TopicsManager.get(null);
                js3.o(topicsManager2, "get(context)");
                super(topicsManager2);
                break;
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final GetTopicsRequest g() {
        switch (this.d) {
            case 0:
                js3.p(null, "request");
                throw null;
            default:
                js3.p(null, "request");
                throw null;
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public js2 h(GetTopicsResponse getTopicsResponse) {
        switch (this.d) {
            case 0:
                js3.p(getTopicsResponse, "response");
                return hz1.b(getTopicsResponse);
            default:
                return super.h(getTopicsResponse);
        }
    }
}
