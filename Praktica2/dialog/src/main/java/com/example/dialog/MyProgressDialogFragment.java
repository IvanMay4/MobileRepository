package com.example.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Log.i("Progress Dialog", "Create Progress Dialog");
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("Загрузка");
        progressDialog.setMessage("Подождите, идёт обработка...");
        new Handler().postDelayed(() -> {
            if (getActivity() != null){
                dismiss();
                ((MainActivity)getActivity()).ProgressFinish();
            }
        }, 3000);
        return  progressDialog;
    }
}
