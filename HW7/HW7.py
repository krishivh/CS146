def minMeetingRooms(intervals):
    intervals.sort()

    endTime  = []

    for interval in intervals:
        start = interval[0]
        end = interval[1]

        assignedServer = False

        for i in range(len(endTime)):
            if endTime [i] <= start:
                endTime [i] = end
                assignedServer = True
                break

        if not assignedServer:
            endTime .append(end)


        endTime.sort()

    return len(endTime)
