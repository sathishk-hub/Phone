package com.sathishk.phone;

import android.annotation.SuppressLint;
import android.telecom.Call;
import android.telecom.InCallService;

@SuppressLint("NewApi")
public class CallService extends InCallService {
    @Override
    public void onCallAdded(Call call) {
        new OngoingCall().setCall(call);
        CallActivity.start(this, call);
    }

    @Override
    public void onCallRemoved(Call call) {
        new OngoingCall().setCall(null);
    }
}
