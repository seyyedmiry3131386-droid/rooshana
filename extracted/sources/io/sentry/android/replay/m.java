package io.sentry.android.replay;

import defpackage.js3;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public volatile ReplayState a;

    public final boolean a(ReplayState replayState) {
        js3.p(replayState, "newState");
        switch (l.a[this.a.ordinal()]) {
            case 1:
                return replayState == ReplayState.STARTED || replayState == ReplayState.CLOSED;
            case 2:
                return replayState == ReplayState.PAUSED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED;
            case 3:
                return replayState == ReplayState.PAUSED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED;
            case 4:
                return replayState == ReplayState.RESUMED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED;
            case 5:
                return replayState == ReplayState.STARTED || replayState == ReplayState.CLOSED;
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
