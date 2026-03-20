package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Здравствуй, МИРЭА!");
        builder.setMessage("Успех близок?");
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setPositiveButton("Иду дальше", (DialogInterface dialog, int id) -> {
            ((MainActivity)getActivity()).ClickPositiveButton();
            dialog.cancel();
        });
        builder.setNeutralButton("На паузе", (DialogInterface dialog,  int id) -> {
            ((MainActivity)getActivity()).ClickNeutralButton();
            dialog.cancel();
        });
        builder.setNegativeButton("Нет", (DialogInterface dialog,  int id) -> {
            ((MainActivity)getActivity()).ClickNegativeButton();
            dialog.cancel();
        });
        return builder.create();
    }
}
