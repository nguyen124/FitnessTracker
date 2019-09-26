package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Excercise;

@Controller
public class MinuteController {

	@RequestMapping(value = "/addMinutes")
	public String addMinute(@ModelAttribute("exercise") Excercise exercise) {
		System.out.println("Exercise: " + exercise.getMinutes());
		return "addMinutes";
	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinute(@ModelAttribute("exercise") Excercise exercise) {
		System.out.println("Exercising: " + exercise.getMinutes());
		return "addMinutes"; // }
	}

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		Activity bike = new Activity();
		run.setDesc("bike");
		activities.add(bike);
		return activities;
	}
}