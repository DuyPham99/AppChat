import { Chip, Stack } from "@mui/material";
import { makeStyles } from '@mui/styles';

const useStyle = makeStyles({
})

const UserMessage = (pros) => {
    const styles = useStyle();
    return (
        <>
            <Chip label={pros.message} color="primary" />
        </>
    )
}

export default UserMessage;