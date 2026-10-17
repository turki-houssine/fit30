package com.example.fit30.service

import com.example.fit30.R
import com.example.fit30.entity.FitnessDay

/**
 * Provides the 30 daily fitness tips.
 * Today the data comes from a local list. Later you can replace getAllDays()
 * with a Room DAO call without touching the controller or the UI.
 */
class FitnessService {

    fun getAllDays(): List<FitnessDay> = days

    private val days = listOf(
        FitnessDay(1, R.drawable.day_01, "Start hydrated", "Drink a full glass of water as soon as you wake up. Aim for 2 liters across the day and keep a bottle within reach."),
        FitnessDay(2, R.drawable.day_02, "Walk 20 minutes", "A brisk walk is the easiest way to begin. Keep a pace where you can talk but not sing."),
        FitnessDay(3, R.drawable.day_03, "Mobility warm-up", "Spend 5 minutes on neck rolls, shoulder circles, hip circles and ankle rotations before any workout."),
        FitnessDay(4, R.drawable.day_04, "10 push-ups", "Do 3 sets of 10 push-ups, on your knees if needed. Keep your body in one straight line."),
        FitnessDay(5, R.drawable.day_05, "Bodyweight squats", "3 sets of 15 squats. Keep your heels on the floor and your chest up."),
        FitnessDay(6, R.drawable.day_06, "Sleep 7-8 hours", "Muscles recover while you sleep. Set a fixed bedtime and put your phone away 30 minutes before."),
        FitnessDay(7, R.drawable.day_07, "Rest and stretch", "Take an easy day. Stretch your legs, back and shoulders for 10 minutes, holding each stretch 30 seconds."),
        FitnessDay(8, R.drawable.day_08, "Light jog", "Jog slowly for 15 minutes. Alternate 1 minute of jogging with 1 minute of walking if you need to."),
        FitnessDay(9, R.drawable.day_09, "Plank 30 seconds", "Hold a forearm plank for 30 seconds, 3 times. Squeeze your abs and glutes, and do not let your hips sag."),
        FitnessDay(10, R.drawable.day_10, "Add vegetables", "Fill half of your plate with vegetables at lunch and dinner. Colorful plates give you more vitamins."),
        FitnessDay(11, R.drawable.day_11, "Take the stairs", "Skip the elevator today. Climbing stairs strengthens your legs and raises your heart rate."),
        FitnessDay(12, R.drawable.day_12, "Lunges", "3 sets of 10 lunges per leg. Keep your front knee above your ankle."),
        FitnessDay(13, R.drawable.day_13, "Protein with every meal", "Eggs, chicken, fish, lentils or yogurt help your muscles recover. Add a protein source to each meal."),
        FitnessDay(14, R.drawable.day_14, "Active recovery", "Go for an easy bike ride or a slow walk for 30 minutes. Keep it relaxed, this is not a hard workout."),
        FitnessDay(15, R.drawable.day_15, "Interval session", "Do 8 rounds of 30 seconds hard effort and 30 seconds rest (jumping jacks, high knees or fast running)."),
        FitnessDay(16, R.drawable.day_16, "Fix your posture", "Check your posture every hour. Shoulders back, chin level, feet flat. Stand up and move every 45 minutes."),
        FitnessDay(17, R.drawable.day_17, "Smart snacks", "Choose fruit, nuts or yogurt instead of sugary snacks. A banana before training gives quick energy."),
        FitnessDay(18, R.drawable.day_18, "Triceps dips", "Use a chair for 3 sets of 10 dips. Keep your elbows pointing backward, not out to the sides."),
        FitnessDay(19, R.drawable.day_19, "Breathing exercise", "Breathe in for 4 seconds, hold for 4, breathe out for 6. Repeat for 3 minutes to lower stress."),
        FitnessDay(20, R.drawable.day_20, "Longer walk or jog", "Go for 30 to 40 minutes at an easy pace. Building endurance matters more than speed."),
        FitnessDay(21, R.drawable.day_21, "Track your progress", "Write down your workouts and how you feel. Looking back at three weeks of work keeps you motivated."),
        FitnessDay(22, R.drawable.day_22, "Calf raises", "3 sets of 20 calf raises on a step. Go slowly and pause at the top."),
        FitnessDay(23, R.drawable.day_23, "Cut sugary drinks", "Replace soda and juice with water, tea or sparkling water. It is one of the simplest nutrition upgrades."),
        FitnessDay(24, R.drawable.day_24, "Core circuit", "Do 3 rounds of 20 crunches, 20 leg raises and a 30-second plank. Rest 1 minute between rounds."),
        FitnessDay(25, R.drawable.day_25, "Full-body circuit", "Do 3 rounds of 10 squats, 10 push-ups, 10 lunges and 10 jumping jacks, resting 1 minute between rounds."),
        FitnessDay(26, R.drawable.day_26, "Check your shoes", "Good shoes protect your knees and ankles. Replace them if the soles are worn or they no longer feel supportive."),
        FitnessDay(27, R.drawable.day_27, "Train with a friend", "Invite someone to join you. Workouts with a partner are easier to stick with."),
        FitnessDay(28, R.drawable.day_28, "Eat slowly", "Put your fork down between bites. It takes about 20 minutes for your brain to register fullness."),
        FitnessDay(29, R.drawable.day_29, "Test yourself", "Repeat your day 4 and day 9 challenges (push-ups and plank) and compare. You should see progress."),
        FitnessDay(30, R.drawable.day_30, "Celebrate and continue", "You finished 30 days. Reward yourself, then set a new goal and keep the habit going.")
    )
}
