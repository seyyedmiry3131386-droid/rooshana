package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
