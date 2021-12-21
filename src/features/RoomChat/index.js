import { Grid, Typography } from "@mui/material";
import { makeStyles } from '@mui/styles';

const useStyle = makeStyles({
    room: {
        marginTop: 10,
        padding: 10,
        fontSize: 18,
        '&:hover': {
            backgroundColor: '#F0F8FF',
            borderRadius: '5px'
        }
    }
})

const RoomChat = (pros) => {
    const styles = useStyle();

    return (
        <Grid className={styles.room}>
            <Typography
                variant="subtitle2"
            >
                {pros.title}
            </Typography>
            <Typography
                variant="body2"
            >
                  {pros.latestMessage}
            </Typography>
        </Grid>
    )
}

export default RoomChat;